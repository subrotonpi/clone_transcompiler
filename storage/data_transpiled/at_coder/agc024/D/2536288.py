def _ _ main _ _ ( ) : return
import sys
import os
import getopt
import getopt
import getopt
import getopt
import getopt
def go ( v , p , curH ) :
    cntCh = 0
    for to in g [ v ] :
        if to == p :
            continue
        cntCh += 1
        go ( to , v , curH + 1 )
    cntCh = max ( cntCh , 1 )
    maxCh = [ max ( maxCh [ curH ] , cntCh ) for curH in range ( 0 , len ( maxCh ) - 1 ) ]
    def updateAns ( start ) :
        curCost = start
        curMaxH = 0
        curCostLong = start
        for h in range ( 0 , len ( maxCh ) - 1 ) :
            if maxCh [ h ] != 0 :
                curCost *= maxCh [ h ]
                curMaxH = h
                curCostLong *= maxCh [ h ]
        if curCost > long ( maxCh [ 0 ] ) :
            return
        if curMaxH < ans or ( curCostLong < ans and ans == curMaxH ) :
            ansH = curMaxH
            ans = curCostLong
    global ans
    ans = int ( ans )
    def solve ( ) :
        n = getopt.Getopt ( 'n' , [ ] )
        g = [ [ ] for _ in range ( n ) ]
        for fr , to in zip ( range ( n + 1 ) , range ( n + 1 ) ) :
            g [ fr ].append ( to )
            g [ to ].append ( fr )
        ans = long ( ans )
        ansH = int ( ans )
        maxCh = [ ]
        for v in range ( n ) :
            [ to ] = 0
            go ( v , v , 0 )
            updateAns ( 1 )
        for v in range ( n ) :
            for to in g [ v ] :
                if to > v :
                    [ to ] = 0
                    go ( v , to , 0 )
                    go ( v , to , 0 )
                    updateAns ( 2 )
    return solve
