package com.knoldus

import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/2/16.
  */

class EmployeeTest extends FunSuite{

  val l=List(Employee(5,"abc",3000),Employee(2,"defc",1500),Employee(1,"frd",2000),Employee(4,"frd",1000))

 test("Sorting Empty list"){

    intercept[IllegalArgumentException]{

    SortedEmployee.sort(List())

    }
  }

  test("Sorting Employee objects"){

    val res=List(Employee(4,"frd",1000),Employee(2,"defc",1500),Employee(1,"frd",2000),Employee(5,"abc",3000))
    assert(res===SortedEmployee.sort(l))

  }

}
