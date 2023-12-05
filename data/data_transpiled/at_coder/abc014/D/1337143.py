def _ ( ) : return
import sys
import getopt
import getopt
import getopt
import getopt
import deque
import getopt
import time
def main ( ) :
    def lca ( u , v ) :
        if head [ u ] != v :
            if depth [ head [ u ] ] < depth [ v ] :
                tmp = u
                v = v
            return lca ( parent [ u ] , v )
        else :
            if depth [ u ] > depth [ v ] :
                tmp = u
                v = v
            return tmp
    def dfs ( c , p ) :
        parent [ c ] = p
        s = - 1
        for d in g [ c ] :
            if d == p : continue
            depth [ d ] = depth [ c ] + 1
            s += dfs ( d , c )
            if to == - 1 or sz [ d ] > sz [ to ] :
                to = d
        sz [ c ] = s
        return s
    def tr ( * args ) :
        print ( " ".join ( args ) )
    def dfs ( c , p ) :
        while q :
            a = time.time ( ) - 1
            b = time.time ( ) - 1
            lca = hl.lca ( a , b )
            ans = hl.depth [ a ] + hl.depth [ b ] - 2 * hl.depth [ lca ] + 1
            print ( ans )
        return hl
    def dfs ( c , p ) :
        return depth [ c ] , depth [ c ]
    def dfs ( c , p ) :
        if p == - 1 :
            return depth [ c ] , depth [ c ]
        return depth [ c ] , depth [ c ]
    def dfs ( c , p ) :
        return depth [ c ] , depth [ c ]
    def dfs ( c , p ) :
        return depth [ c ] , depth [ c ]
    def dfs ( c , p ) :
        return depth [ c ] , depth [ c ]
    def dfs ( c , p ) :
        return depth [ c ] , depth [ c ]
    def dfs ( c , p ) :
        return depth [ c ] , depth [ c ]
    def dfs ( c ,