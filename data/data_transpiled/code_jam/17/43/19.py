def _ ( ) : return ''
import sys
import os
import sys
import getopt
def main ( args ) :
    sc = getopt.getopt ( args , '' )
    out = sys.stdout
    R , C = sc.size
    def traverse ( visited , x , y , dx , dy ) :
        if x < 0 or x >= R : return True
        if y < 0 or y >= C : return True
        if arr [ x ] [ y ] == '.' :
            visited [ x ] [ y ] = True
            return traverse ( visited , x + dx , y + dy , dx , dy )
        elif arr [ x ] [ y ] == '|' or arr [ x ] [ y ] == '-' :
            return False
        elif arr [ x ] [ y ] == ' \ \' :
            return traverse ( visited , x + dy , y + dx , dy , dx )
        elif arr [ x ] [ y ] == '/' :
            return traverse ( visited , x - dy , y - dx , - dy , - dx )
        return True
    def isOk ( ) :
        visited = [ ]
        for i in range ( R ) :
            for j in range ( C ) :
                if arr [ i ] [ j ] == '|' :
                    if not traverse ( visited , i - 1 , j , - 1 , 0 ) : return False
                    if not traverse ( visited , i + 1 , j , 1 , 0 ) : return False
            elif arr [ i ] [ j ] == '-' :
                if not traverse ( visited , i , j - 1 , 0 , - 1 ) : return False
                if not traverse ( visited , i , j + 1 , 0 , 1 ) : return False
    for i in range ( R ) :
        for j in range ( C ) :
            if arr [ i ] [ j ] == '.' and not visited [ i ] [ j ] : return False
    return True
def solve ( ) :
    R = sc.size
    C = sc.size
    arr = [ ]
    for i in range ( R ) :
        if arr [ i ] [ j ] == '.' or arr [ i ] [ j ] == '|' : return True
    return True