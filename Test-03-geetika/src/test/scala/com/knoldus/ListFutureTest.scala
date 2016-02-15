package com.knoldus

import org.scalatest.FunSuite

import scala.concurrent.{Await, Future}

import scala.concurrent.duration._

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by knoldus on 15/2/16.
  */

class ListFutureTest extends FunSuite{

  test("Empty list of futures"){

    intercept[IllegalArgumentException]{

      val response:Future[Int]=ListFuture.makeListFuture(List())

    }

  }

  test("First Future To be completed"){

    val list=List(5,4,2)
    val response=ListFuture.makeListFuture(list)
    val res=Await.result(response,10 seconds)
    assert(res=== 120|| res===24 ||res===2)

  }


}
