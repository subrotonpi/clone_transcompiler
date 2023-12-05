def import _readline
import locale
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import time
import sys
class first :
    def __init__ ( self ) :
        readline = readline
        self.readline = readline
        self.readline = readline
        self.readline = readline
        self.strip = ''
        self.readline = readline
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
        self.strip = ''
    def readline ( self ) :
        return readline ( self )
    def readline ( self ) :
        return readline
    def readline ( self ) :
        return self.strip
    def readline ( self ) :
        return readline
    def readline ( self ) :
        return self.strip
    def solve ( ) :
        n = len ( self.readline )
        gm = [ ]
        kilk = [ 0 ] * n
        win = [ 0 ] * n
        wp = [ 0 ] * n
        owp = [ 0 ] * n
        oowp = [ 0 ] * n
        for i in range ( n ) :
            gm [ i ] = readline ( self )
        for i in range ( n ) :
            for j in range ( n ) :
                if gm [ i ] [ j ] != '.' :
                    kilk [ i ] += 1
                    win [ i ] += gm [ i ] [ j ] - '0'
            wp [ i ] = win [ i ] / kilk [ i ]
        for i in range ( n ) :
            count = 0
            for j in range ( n ) :
                if gm [ i ] [ j ] != '.' :
                    count += 1
                    owp [ i ] += ( win [ j ] - gm [ i ] [ j ] + '0' ) / ( kilk [ j ] - 1 )
                owp [ i ] /= count
        for i in range ( n ) :
            out.write ( '%.9f\n' % ( wp [ i ]