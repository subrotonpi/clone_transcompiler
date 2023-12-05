def import _solution
import os
import sys
class Solution ( object ) :
    class Road ( object ) :
        def __init__ ( self , add ) :
            self.len = len
            self.add = add
        def __lt__ ( self , other ) :
            return self.add - other.add
    def go ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            with open ( "output.txt" , "w" ) as pw :
                casecnt = sc.readlines ( )
                for casenum in range ( 1 , casecnt + 1 ) :
                    X , S , R , t , N = sc.readlines ( )
                    r = [ ]
                    for B , E , w in zip ( S , R ) :
                        r.append ( Road ( E - B , w ) )
                        X -= r [ - 1 ].len
                    r.append ( Road ( X , 0 ) )
                    r.sort ( )
                    res = 0.0
                    for need in r :
                        if need < t :
                            t -= need
                            res += need
                        else :
                            dist = r [ - 1 ].len - ( R + r [ - 1 ].add ) * t
                            res += t
                            t = 0
                            res += dist / float ( S + r [ - 1 ].add )
                    pw.write ( "Case #%d: %f\n" % ( casenum , res ) )
        pw.flush ( )
        pw.close ( )
        sc.close ( )
