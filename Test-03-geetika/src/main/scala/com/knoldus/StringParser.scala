
package com.knoldus

/**
  * Created by knoldus on 15/2/16.
  */


class StringParser(st:Array[Char],top:Int) {

  def push(a:Char)={
    st(top)=a
    top+=1
  }
  def pop():Int={
    top-=1
    st(top).toInt
  }

  def compute(s:String)= {

    val arr=s.toCharArray
    for(i<-0 to arr.length-1){

      if(arr(i)=='('||arr(i)=='0'||arr(i)=='1'||arr(i)=='2'||arr(i)=='3'||arr(i)=='4'||arr(i)=='5'||arr(i)=='6'||arr(i)=='7'||arr(i)=='8'||arr(i)=='9')
        push(arr(i))
      else if(arr(i)=='+'||arr(i)=='*'||arr(i)=='-'||arr(i)=='/'){

        val x=pop()
        arr(i) match {
          case '+' => val r = x + arr(i+1).toInt
            push(r.toChar)
          case '-' => val r = x - arr(i+1).toInt
            push(r.toChar)
          case '*' => val r = x + arr(i+1).toInt
            push(r.toChar)
          case '/' => val r = x + arr(i+1).toInt
            push(r.toChar)
        }

        }

      else{

        val n=pop()

    }

  }
  }
}

