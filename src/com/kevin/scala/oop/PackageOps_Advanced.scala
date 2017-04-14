package com.dt.scala.oop
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */

package spark{
  package navigation{
    private[spark] class Navigator{//说明对spack包中的所有类和对象可见
      protected[navigation] def useStarChart() {}//navigation中的所有都能访问
      class LegOfJourney {
        private[Navigator] val distance =100
      }
      private[this] var speed = 200//Navigator的实例阔以访问
    }
  }
  
  package launch{
    import navigation._
    object Vehicle {
      private[launch] val guide = new Navigator
      
    }
  }
}

class PackageOps_Advanced{
  import PackageOps_Advanced.power
  
  private def canMakeItTrue = power >10001
  
}

object PackageOps_Advanced{//半生类和半生对象阔以互相访问
  private def power = 10000
  
  def makeItTrue(p : PackageOps_Advanced): Boolean = {
     val result = p.canMakeItTrue 
     result
  }
}

