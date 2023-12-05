def import import sys
import os
import sys
import string
import math
import csv
import csv
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.N = int ( self.N )
        A = int ( self.A )
        B = int ( self.B )
        if A + B - 1 > N or A * B < N :
            print ( - 1 )
            return
    anslist = [ ]
    n , m , l = 0 , 0 , 0
    if B > 1 :
        n = ( N - A ) / ( B - 1 )
        m = A - n - 1
        l = N - n * B - m
    else :
        m = A
    for i in range ( n ) :
        for j in range ( B , 0 , - 1 ) :
            anslist.append ( i * B + j )
    for i in range ( n * B + l , n * B - 1 , - 1 ) :
        anslist.append ( i )
    for i in range ( n * B + l + 1 , N + 1 ) :
        anslist.append ( i )
    f = csv.writer ( sys.stdout )
    for i in anslist :
        f.writerow ( [ i ] + ( '\n' if i == N - 1 else ' ' ) )
    f.flush ( )
    f.close ( )
