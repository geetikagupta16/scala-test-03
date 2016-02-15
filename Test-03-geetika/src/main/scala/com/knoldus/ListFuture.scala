package com.knoldus

import scala.collection.mutable.ListBuffer
import scala.concurrent.{Promise, Future}
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global


/**
  * Created by knoldus on 15/2/16.
  */


object ListFuture {

  def fact(n: Int): Int = {
    if (n == 1)
      1
    else
      n * fact(n - 1)

  }

  def makeListFuture(l: List[Int]) = {

    def checkComplete(list: List[Future[Int]]): Future[Int] = {
      require(list.nonEmpty)
      val l: ListBuffer[Future[Int]] = ListBuffer()
      for (i <- list) {
        if (i.isCompleted) {
          l += i
        }
      }

      l.head

    /*val promise=Promise[Int]
      list.foreach(_.onComplete{ case x=>promise.complete(x)})
      promise.future
      */
    }

    val list = l.map(x => Future {
      fact(x)
    })
    checkComplete(list)
  }
}