def import _StandingOvation
import os
import os
import sys
import os
import sys
filename = 'C:/Users/Kevin/algs4/CodeJam/StandingOvation/A-large.in'
output = 'largefinaloutput.txt'
def nb_friends ( shylevels ) :
    total = 0
    ret = 0
    for i in shylevels :
        ret = max ( ret , i - total )
        total += i
    return ret
def nb_friends ( shylevels ) :
    with open ( os.path.join ( filename , 'A-large.in' ) , 'r' ) as sc :
        no_of_times = sc.readline ( ).split ( ) [ 1 ]
        for i in range ( no_of_times ) :
            sc.readline ( )
            shylevelchars = sc.readline ( ).split ( )
            shylevels = [ int ( ( ord ( c ) ) ) for c in shylevelchars [ 1 : ] ]
            f = open ( output , 'w' , encoding = 'utf-8' )
            f.write ( ( 'Case #%d: %d\n' % ( i + 1 , nb_friends ( shylevels ) ) ).encode ( 'utf-8' ) )
            f.close ( )
