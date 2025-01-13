package com.example.util;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

//インターセプタクラス
@Interceptor
//インターセプタの優先順位を定義
@Priority(Interceptor.Priority.APPLICATION)
@InterceptorAnnotation
public class SampleInterceptor {
	
	@AroundInvoke
	public Object obj(InvocationContext ic){
		Object result = null;
		//メソッド名取得
		String methodName = ic.getMethod().getName();
		try {
			//メソッド実行前の処理
			System.out.println(methodName + " 実行開始");

			//メソッドの実行
			result = ic.proceed();

			//メソッドの実行後（正常終了時）
			System.out.println(methodName + " 実行終了");

			return result;
			
		}catch(Exception e) {
			//エラー発生時
			System.out.println(methodName + " 実行中にエラーが発生");
			return result;
		}
	}

}
