def import _np
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.map = { }
        INF = math.inf / 2
        self.n , self.m = self.n , self.m
    def __init__ ( self ) :
        sc = sys.stdin
        self.n , self.m = self.n , self.m
        v = [ Edge ( ) for i in range ( self.m ) ]
        v.from_value = sc.read ( )
        v.to_value = sc.read ( )
        v.cost = - sc.read ( )
        self.dis = [ INF ] * ( n + 1 )
        self.dis [ 1 ] = 0
        flag = True
        ans = 0
        count = 0
        while flag :
            flag = False
            for i in range ( self.m ) :
                if self.dis [ v [ i ].from_value ] + self.dis [ v [ i ].cost ] < self.dis [ v [ i ].to_value ] :
                    self.dis [ v [ i ].to_value ] = self.dis [ v [ i ].from_value ] + self.dis [ v [ i ].cost ]
                    flag = True
            if count == self.n :
                ans = self.dis [ n ]
            if count == 2 * self.n :
                if ans > self.dis [ n ] :
                    print ( 'inf' )
                    return
                else :
                    print ( - self.dis [ n ] )
                    return
            count += 1
            if not flag :
                break
        print ( - self.dis [ n ] )
class Edge ( object ) :
    def __init__ ( self ) :
        self.to = self.to = self.from = self.cost = 0
class MyComparator ( object ) :
    def __init__ ( self , obj1 , obj2 ) :
        self.num1 = int ( obj1 )
        self.num2 = int ( obj2 )
        if self.num1 < self.num2 :
            return 1
        elif self.num1 > self.num2 :
            return - 1
        else :
            return 0
return Main ( )
