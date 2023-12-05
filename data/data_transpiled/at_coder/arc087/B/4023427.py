def _ ( ) : return 'Yes'
import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.rec = [ ]
    def __init__ ( self ) :
        self.rec.append ( [ ] )
    def go ( self ) :
        sc = getopt.Getgetopt ( self.rec , 't' )
        s = sc [ 0 ]
        x , y = sc [ 1 ] , sc [ 2 ]
        start , n = 0 , len ( s )
        while start < n and s [ start ] == 'F' : start += 1
        hori , vert = [ ] , [ ]
        parity = 0
        i = start
        while i < n :
            if s [ i ] == 'T' :
                parity = 1 - parity
                i += 1
            else :
                j = i + 1
                while j < n and s [ j ] == 'F' : j += 1
                if parity == 0 : hori.append ( j - i )
                else : vert.append ( j - i )
                i = j
        ans = 'Yes' if self.help ( x - start , hori ) and self.help ( y , vert ) else 'No'
        print ( ans )
    def help ( self , target , step ) :
        sum = 0
        for w in step : sum += w
        if target < abs ( self.rec [ target ] ) : return False
        if target == abs ( self.rec [ target ] ) : return True
        cur , next = [ False ] , [ True ]
        for w in step :
            for j in range ( 0 , 2 * self.rec [ target + w ] ) :
                if cur [ j ] :
                    next [ j - w ] = True
                    next [ j + w ] = True
            cur , next = next , [ False ]
        return cur [ target + sum ]
