def import _AShow
import os
import sys
import os
import sys
import time
import csv
class AShow ( object ) :
    def __init__ ( self ) :
        self.f = sys.argv [ 0 ]
        f2 = os.path.dirname ( os.path.abspath ( sys.argv [ 0 ] ) ) + '.out'
        with open ( f2 , 'r' ) as s :
            T = s.readline ( ).split ( ) [ 0 ]
            for t in range ( 1 , T + 1 ) :
                N = s.readline ( ).split ( ) [ 1 ]
                points = [ ]
                total = 0
                for i in range ( N ) :
                    total += points.append ( s.readline ( ).split ( ) [ 0 ] )
                println ( f2 , 'Case #%d: %s' % ( t , solve ( points , total ) ) )
    def solve ( points , tot ) :
        s = ""
        for i in range ( len ( points ) ) :
            if i > 0 :
                s += " "
            min , max = 0 , 100
            while abs ( max - min ) > 1e-6 :
                if ok ( points , i , min , tot ) :
                    break
                mid = ( max + min ) / 2
                if ok ( points , i , mid , tot ) :
                    max = mid
                else :
                    min = mid
            s += min
        return s
    def ok ( points , idx , pct , tot ) :
        val = points [ idx ] + pct * tot / 100.
        rem = 100 - pct
        inplay = 0
        subtot = 0
        for x in range ( len ( points ) ) :
            if x == idx :
                continue
            if points [ x ] > val :
                continue
            inplay += 1
            subtot += points [ x ]
        if inplay == 0 :
            return False
        xyz = ( subtot + rem * tot / 100.) * 1./ inplay
        if val >= xyz :
            return True
        return False
    def write ( self , s ) :
        w = open ( f , 'w' , encoding = 'utf-8' )
        w.write ( s + ' \n