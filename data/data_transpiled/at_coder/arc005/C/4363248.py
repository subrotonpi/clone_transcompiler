def _ ( ) : return
import sys
import getopt
import getopt
def main ( ) :
    sc = getopt.getopt ( sys.argv [ 1 : ] , '' )
    h = sc.getmaxyx ( )
    w = sc.getmaxyx ( )
    start = ( 0 , 0 )
    goal = ( 0 , 0 )
    map = [ [ ] ]
    hei = [ [ ] for i in range ( h ) ]
    for a in sc :
        for j in range ( w ) :
            if a [ j ] == 's' :
                start = ( j , i )
            elif a [ j ] == 'g' :
                goal = ( j , i )
            else :
                map [ i ].append ( a [ j ] )
    q = getopt.Getgetopt ( start , '' )
    dx = [ 0 , 0 , 1 , - 1 ]
    dy = [ 1 , - 1 , 0 , 0 ]
    while not q.empty ( ) :
        p = q.pop ( )
        for i in range ( 4 ) :
            if judge ( p [ 0 ] + dx [ i ] , p [ 1 ] + dy [ i ] , map ) :
                if map [ p [ 1 ] + dy [ i ] ] [ p [ 0 ] + dx [ i ] ] == '#' and hei [ p [ 1 ] ] [ p [ 0 ] ] == 2 :
                    continue
                elif map [ p [ 1 ] + dy [ i ] ] [ p [ 0 ] + dx [ i ] ] == '#' :
                    hei [ p [ 1 ] + dy [ i ] ] [ p [ 0 ] + dx [ i ] ] = hei [ p [ 1 ] ] [ p [ 0 ] ] + 1
                    q.append ( ( p [ 0 ] + dx [ i ] , p [ 1 ] + dy [ i ] ) )
                else :
                    hei [ p [ 1 ] + dy [ i ] ] [ p [ 0 ] + dx [ i ] ] = hei [ p [ 0 ] ] [ p [ 0 ] ] + 1
                    q.append ( ( p [ 0 ] + dx [ i ] , p [ 1 ] + dy [ i ] ) )
    return
