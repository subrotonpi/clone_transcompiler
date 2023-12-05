def import _py_func
import os
import sys
import numpy
class Main ( object ) :
    def __init__ ( self ) :
        self.rec = [ ]
    def __call__ ( self , * args ) :
        sc = open ( "../data/" + self.target , "r" )
        n , K = sc.shape
        self.rec = [ ]
        self.sum = 0.0
        for w , p in zip ( sc.read ( ) , args ) :
            self.rec.append ( [ w , p ] )
            self.sum += p
        if self.sum < 0.0001 :
            print ( 0 )
            return
        lo , hi = 0 , 1
        for i in range ( 33 ) :
            mid = ( lo + hi ) / 2
            if self.check ( mid , K , n ) :
                lo = mid
            else :
                hi = mid
        print ( lo * 100 )
    def check ( self , target , K , n ) :
        mc = _py_func ( self , target )
        self.rec = [ mc ]
        w , q = 0 , 0
        for i in range ( n - 1 , n - K - 1 , - 1 ) :
            w += self.rec [ i ] [ 0 ]
            q += self.rec [ i ] [ 1 ] * self.rec [ i ] [ 0 ]
        return q / w >= target
class myC ( Comparator ) :
    def __init__ ( self , t ) :
        self.target = t
    def compare ( self , a , b ) :
        return numpy.compare ( a [ 0 ] * ( a [ 1 ] - target ) , b [ 0 ] * ( b [ 1 ] - target ) )
