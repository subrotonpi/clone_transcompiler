def import calc
import sys
import os
import sys
from itertools import repeat
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
        self.n = None
        self.k = None
        self.as = [ ]
        with open ( '/proc/self/' , 'r' ) as sc :
            n = sc.read ( )
            k = sc.read ( )
            for i in range ( n ) :
                self.as.append ( sc.read ( ) - 1 )
        print ( Calculator ( n , k , self.as ).calculate ( ) )
    def __init__ ( self , * args ) :
        self.k = None
        self.answer = 0
        self.is_calculate = False
        self.lists = [ ]
        def dfs ( n , k , self.as ) :
            self.k = k
            for i in range ( n ) :
                self.lists.append ( [ ] )
            for i in range ( n ) :
                for j in self.as [ i ] :
                    if 0 < i :
                        self.lists [ j ].append ( i )
                    elif 0 < j :
                        self.answer += 1
        def calculate ( self ) :
            if not self.is_calculate :
                self.dfs ( 0 , 0 )
                self.is_calculate = True
            return self.answer
        def dfs ( self , a , pre = 0 ) :
            h = 0
            for i in self.lists [ a ] :
                h = max ( h , self.dfs ( i , a ) )
            if 0 < pre and h == self.k - 1 :
                h = 0
                self.answer += 1
            else :
                h += 1
            return h
