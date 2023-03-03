def import import sys
import random
import sys
import random
import sys
import sys
import random
import sys
import sys
INF = 100000000
def main ( ) :
    global INF
    INF = 100000000
    for i in range ( n ) :
        for j in range ( n ) :
            cost [ i ] [ j ] = INF
    for i in range ( m ) :
        a , b , c = random.randint ( - 1 , 1 )
        cost [ a ] [ b ] = c
        cost [ b ] [ a ] = c
    ans = solve ( n , cost )
    print ( ans )
def solve ( n , cost ) :
    d = [ ]
    min = INF
    for i in range ( n ) :
        d = dijkstra ( i , n , cost )
        d.sort ( reverse = True )
        min = min ( min , d [ 0 ] )
    return min
def dijkstra ( from_list , n , cost ) :
    d = [ ]
    d.append ( from_list )
    for i in range ( n ) :
        if i == from_list :
            continue
        d.append ( INF )
    visited = [ ]
    while True :
        v = - 1
        for u in range ( n ) :
            if not visited [ u ] and ( v == - 1 or d [ u ] < d [ v ] ) :
                v = u
        if v == - 1 :
            break
        visited.append ( True )
        for u in range ( n ) :
            d [ u ] = min ( d [ u ] , d [ v ] + cost [ v ] [ u ] )
    return d
