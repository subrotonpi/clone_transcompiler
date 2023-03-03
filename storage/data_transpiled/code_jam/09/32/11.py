def import import os , glob
import locale
import random
import math
import random
import locale
import os
import locale
import random
import sys
EPS = 1e-8
def run ( ) :
    locale.setlocale ( locale.LC_ALL , '' )
    f = open ( "small.in" , "r" )
    out = open ( "small.out" , "w" )
    test = random.randint ( 1 , 5 )
    for nt in range ( 1 , test + 1 ) :
        n = random.randint ( 1 , 3 )
        sumcoord = [ ]
        sumv = [ ]
        for i in range ( n ) :
            for j in range ( 3 ) :
                q = random.uniform ( 0 , 1 )
                sumcoord.append ( q )
            for j in range ( 3 ) :
                q = random.uniform ( 0 , 1 )
                sumv.append ( q )
        a = 0.
        for j in range ( 3 ) :
            a += sumv [ j ] * sumv [ j ]
        b = 0.
        for j in range ( 3 ) :
            b += 2.0d * sumcoord [ j ] * sumv [ j ]
        c = 0.
        for j in range ( 3 ) :
            c += sumcoord [ j ] * sumcoord [ j ]
        ret = 0.
        dist0 = c
        if abs ( a ) >= EPS :
            t = - b / ( 2 * a )
        else :
            t = - b / ( 2 * a )
        dist = a * t ** 2 + b * t + c
        if dist < dist0 - EPS :
            ret = t
    ret_dist = math.sqrt ( a * ret ** 2 + b * ret + c ) / n
    print ( "Case #%d: " % nt , end = ' ' , file = out )
    print ( "%.8f" % ret_dist , end = ' ' , file = out )
    print ( "%.8f\n" % ret , end = ' ' , file = out )
