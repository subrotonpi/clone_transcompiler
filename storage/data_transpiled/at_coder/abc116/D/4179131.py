def _import ( ) : return
import os
import sys
import time
import itertools
import sushi
class sushi :
    def __init__ ( self , t , d ) :
        self.t = t
        self.d = d
    def getd ( self ) : return self.d
class Main :
    sc = sys.stdin
    st = [ ]
    N = sc.__next__ ( )
    K = sc.__next__ ( )
    S = [ sushi ]
    used = [ False ] * ( N + 1 )
    sum_t = 0
    sum_d = 0
    ans = 0
    def main ( ) :
        for t , d in sc.items ( ) :
            su = sushi ( t , d )
            S.append ( su )
        S.sort ( key = sushi.getd ).reversed ( )
        for i in range ( K ) :
            if used [ S [ i ].t ] :
                st.append ( S [ i ].d )
            else :
                used [ S [ i ].t ] = True
                sum_t += 1
            sum_d += S [ i ].d
        ans = sum_d + sum_t * sum_t
        for i in range ( K , N ) :
            if st.empty ( ) : break
            if used [ S [ i ].t ] : continue
            used [ S [ i ].t ] = True
            sum_t += 1
            sum_d += S [ i ].d - int ( st.pop ( ) )
            ans = max ( ans , sum_d + sum_t * sum_t )
        print ( ans )
    Note :./ Main._ _ uses _ or _ unsafe.operations.Note : Recompile SPACETOKEN with - Xlint : unchecked SPACETOKEN for SPACETOKEN details.
