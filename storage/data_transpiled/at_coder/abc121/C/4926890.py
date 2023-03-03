def import _import_list
import sys
import os
import sys
import itertools
import csv
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( sys.argv [ 1 ] ) as f :
                n = int ( f.read ( ) )
                m = int ( f.read ( ) )
        except :
            n = int ( sys.stdin.readline ( ) )
            m = int ( sys.stdin.readline ( ) )
    def __init__ ( self , n , m ) :
        self.list = itertools.repeat ( n , m )
        self.list = sorted ( self.list , key = lambda x : x.price - x.price )
        sum = 0
        for store in self.list :
            if store.amount >= m :
                sum += long ( store.price * m )
                break
            else :
                sum += long ( store.price * store.amount )
                m -= store.amount
        print ( sum )
