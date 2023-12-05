def import _canset
import sys
import os
import sys
class Main ( object ) :
    def canset ( self , x , lst ) :
        seen = set ( [ 0 ] )
        for i in lst :
            newSet = set ( )
            for j in seen :
                newSet.add ( j + i )
                newSet.add ( j - i )
            self.seen = newSet
        return x in self.seen
    def main ( ) :
        s = sys.stdin.read ( ) + 'T'
        x = sys.stdin.tell ( )
        y = sys.stdin.tell ( )
        hol = [ ]
        ver = [ ]
        index = 0
        while s [ index ] != 'T' : index += 1
        x -= index
        cnt = 0
        vec = 0
        for i in s [ index : ] :
            if i == 'F' : cnt += 1
            else :
                vec += 1
                if cnt > 0 :
                    if vec % 2 == 1 :
                        hol.append ( cnt )
                    else :
                        ver.append ( cnt )
                    cnt = 0
        if canset ( x , hol ) and canset ( y , ver ) :
            print ( 'Yes' )
        else :
            print ( 'No' )
