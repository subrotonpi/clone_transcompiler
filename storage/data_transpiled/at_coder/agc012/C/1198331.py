def import _iter_deque
import Queue
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.sc = sys.stdin
        N = os.fstat ( N ).st_size
        self.N += 1
        deque = deque ( )
        self.cur_val = 1
        self.lis = [ ]
        while N > 0 :
            if N % 2 == 0 :
                self.lis.append ( 0 )
            else :
                self.lis.append ( 1 )
            N /= 2
        for i in range ( len ( self.lis ) - 2 , - 1 , - 1 ) :
            deque.append ( self.cur_val )
            if self.lis [ i ] == 1 :
                self.cur_val += 1
                deque.appendleft ( self.cur_val )
            self.cur_val += 1
        self.cur_val -= 1
        print ( self.cur_val * 2 )
        for i in range ( self.cur_val ) :
            print ( self.deque.popleft ( ) , end = ' ' )
        for i in range ( 1 , self.cur_val + 1 ) :
            print ( i , self.cur_val + ( i == self.cur_val and '\n' ) , end = ' ' )
    def tr ( self , * args ) :
        print ( " ".join ( self.args ) )
