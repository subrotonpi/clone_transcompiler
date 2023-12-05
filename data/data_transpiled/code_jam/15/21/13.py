def import _count_culture
import math
import sys
import os
import sys
import sys
class CounterCulture :
    def __init__ ( self ) :
        self.c = 0
    def __repr__ ( self ) :
        f = open ( 'in.in' , 'r' )
        f = open ( 'out.out' , 'w' )
        t = int ( f.readline ( ) )
        for c in range ( 1 , t + 1 ) :
            f.write ( 'Case #%d: ' % c )
            line = f.readline ( )
            num = int ( line )
            f.write ( '%s\n' % ( self._count ( num ) , ) )
        f.close ( )
    def _count ( num ) :
        print ( '%d   ' % num , end = ' ' )
        n = '%d' % ( num - 1 )
        count = 0
        length = len ( n )
        if length == 1 :
            return num
        incr = 0
        if length % 2 == 0 :
            prev = count
            for i in range ( length / 2 ) :
                count += ( n [ i ] - '0' ) * pow ( 10 , i )
            if count > prev + 1 :
                incr = 1
            for i in range ( length / 2 ) :
                count += ( n [ length - 1 - i ] - '0' ) * pow ( 10 , i )
        else :
            prev = count
            for i in range ( length / 2 ) :
                count += ( n [ i ] - '0' ) * pow ( 10 , i )
            if count > prev + 1 :
                incr = 1
            for i in range ( length / 2 + 1 ) :
                count += ( n [ length - 1 - i ] - '0' ) * pow ( 10 , i )
        count += incr
        print ( count )
        return count + _count ( pow ( 10 , length - 1 ) )
    def pow ( self , base , e ) :
        if e == 0 :
            return 1
        if e % 2 == 0 :
            return pow ( base * base , e / 2 )
        return base * pow ( base , e - 1 )
