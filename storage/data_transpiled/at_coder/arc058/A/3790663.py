def import _solve
import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( sys.argv [ 1 ] ) as sc :
                solve ( sc )
        except IOError :
            print ( "No such file or directory" )
            return
    def solve ( self ) :
        N , K = self.shape
        self.shape = ( N , K )
        self.shape = ( K , K )
        Ds = self.shape
        DSet = set ( Ds )
        contains = True
        while contains :
            contains = False
            ns = str ( N )
            for i in range ( len ( ns ) ) :
                if str ( ns [ i ] ) in DSet :
                    N += 1
                    contains = True
                    break
        print ( N )
