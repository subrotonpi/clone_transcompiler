def import _ProblemC
import sys
class ProblemC ( object ) :
    def __init__ ( self ) :
        self._ProblemC = None
    def __init__ ( self ) :
        sc = sys.stdin
        f = open ( "C-in.txt" , "w" )
        self._ProblemC.__init__ ( self )
        self.C = int ( sc.readline ( ) )
        for i in range ( 1 , C + 1 ) :
            data = self._parse_int ( sc.readline ( ) )
            n_submissions = data [ 0 ]
            n_questions = data [ 1 ]
            probs = [ ]
            for j in range ( n_questions ) :
                probs.append ( self._parse_double_array ( sc.readline ( ) ) )
            products = [ ]
            self.recurse ( products , 0 , 1.0 )
            products.sort ( )
            remaining = n_submissions
            ans = 0.0
            for j in range ( len ( products ) - 1 , - 1 , - 1 ) :
                ans += products [ j ]
                remaining -= 1
            f.write ( "Case #%d: %f\n" % ( i , ans ) )
        f.flush ( )
        f.close ( )
    def recurse ( self , products , index , sofar ) :
        if index == n_questions :
            products.append ( sofar )
        else :
            for i in range ( 4 ) :
                self.recurse ( products , index + 1 , sofar * probs [ index ] [ i ] )
    def parse_int ( s ) :
        s = s.split ( )
        ret = [ int ( i ) for i in s ]
        return ret
    def parse_double_array ( s ) :
        s = s.split ( )
        ret = [ ]
        for i in s :
            ret.append ( float ( i ) )
        return ret
