def import _main
import sys
import time
import random
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.c = int ( sys.stdin.readline ( ) )
        self.k = int ( sys.stdin.readline ( ) )
        self.m = 0
        self.ans = 1
        self.times = [ ]
        for i in range ( self.n ) :
            self.times.append ( random.randint ( 0 , n ) )
        self.times.sort ( )
        for i in range ( self.n ) :
            if self.times [ i ] - self.times [ m ] > k or i - self.m == self.c :
                self.m = i
                self.ans += 1
        print ( self.ans )
        self.sc.close ( )
    def gcd ( a , b ) :
        if a < b :
            tmpp = a
            a , b = b , tmpp
        if b == 0 :
            return a
        else :
            return gcd ( b , a % b )
    def lcm ( a , b ) :
        gcd = gcd ( a , b )
        return a / gcd * b
    def dfs ( self , placenow ) :
        visit [ placenow ] = True
        success = True
        for i in range ( self.n ) :
            if visit [ i ] == False :
                success = False
                break
        if success :
            self.ans += 1
            visit [ placenow ] = False
            return
        for w in self.w :
            if w == placenow and visit [ ww [ i ] ] == False :
                dfs ( ww [ i ] )
            elif ww [ i ] == placenow and visit [ w [ i ] ] == False :
                dfs ( w [ i ] )
            else :
                continue
        visit [ placenow ] = False
        return
