package com.knoldus

/**
  * Created by knoldus on 15/2/16.
  */
case class Employee( id:Int,name:String,sal:Int)

  object Employee extends Ordering[Employee] {

 def compare(e1: Employee, e2: Employee): Int= {

    if (e1.sal > e2.sal) 1
    else  if(e1.sal < e2.sal) -1
    else 0

  }

}
  object SortedEmployee{

  def sort(list:List[Employee]):List[Employee]={

    list.sorted(Employee)

  }

}
