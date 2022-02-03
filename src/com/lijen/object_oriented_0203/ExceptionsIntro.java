package com.lijen.object_oriented_0203;

import org.junit.Test;

/*
 * Exception:因為編成錯誤或外在因素導致的一般性問題,可以使用針對性的代碼進行處理。例如:
 * 	-空指針訪問
 * 	-試圖讀取不存在文件
 * 	-網路連接中斷
 * 	-數組角標越界
 * 
 * 分類:受檢異常(CheckedException) vs 非受檢異常(UncheckedException)
 * 
 * 異常的體系結構:
 * 		|-----java.lang.Error:一般不編寫針對性的代碼處理。
 * 
 * 
 * 		|-----java.lang.Exception:可以進行異常的處理
 * 			|-----編譯時異常(checked)
 * 				|-----IOException
 * 					|-----FileNotFoundException
 * 				|-----ClassNotFoundException
 * 			|-----運行時異常(unchecked)
 * 				|-----NullPointerException(空指針異常)
 * 				|-----ArrayIndexOutOfBoundsException(數組角標超過異常)
 * 				|-----ClassCastException
 * 				|-----NumberFormatException
 * 				|-----InputMismatchException
 * 				|-----ArithmeticException
 * 
 * Java的異常處理:抓拋模型
 * 		過程一:"拋",程序在執行過程中,一旦出現異常,就會在異常代碼處生成一個對應的異常類物件。
 * 			 並將此物件拋出。一旦拋出後,其後的代碼就不在執行。
 * 			
 * 			!關於異常物件的產生:(1)由java.lang.Exception自動生成
 * 						   (2)由throw主動拋出。
 * 			
 * 		過程二:"抓",可以理解為異常處理的方式,如:"try-catch-finally"或"throws + 異常類型"
 * 
 * 			!異常處理的方式一般分為兩種:
 * 				方式一:try-catch-finally
 * 
 * 				方式二:throws + 異常類型
 * 
 * 
 */
public class ExceptionsIntro {

}
