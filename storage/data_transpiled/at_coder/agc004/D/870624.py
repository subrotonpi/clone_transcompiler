def import threading
import threading
import threading
import threading
import sys
import threading
import threading
class MyThread :
    def __init__ ( self ) :
        threading.Thread ( None , my_func , name = '' , timeout = 1 << 26 ).start ( )
    def start ( self ) :
        self.n = 0
        self.k = 0
        self.as = [ ]
        with threading.Thread ( target = self.my_func ) as sc :
            n = sc.__next__ ( )
            k = sc.__next__ ( )
            for i in range ( n ) :
                self.as.append ( sc.__next__ ( ) - 1 )
        print ( Calculator ( n , k , self.as ).calculate ( ) )
class Calculator :
    def __init__ ( self ) :
        self.k = k
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
