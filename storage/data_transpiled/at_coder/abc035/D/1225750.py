def _import ( ) : return sys.stdin
import StringIO
import getopt
import getopt
import getopt
import getopt
import getopt
import getopt
import getopt
import getopt
import getopt
import getopt
import getopt
import time
import time
import time
import sys
from getopt import getopt
import getopt
from getopt import getopt
def next_string ( ) :
    try :
        getopt.getopt ( ' ' , ' ' )
    except getopt.error :
        raise
    return int ( raw_input ( ) )
def next_long_array ( ) :
    res = [ ]
    for i in range ( n ) :
        res.append ( randint ( 0 , sys.maxint ) )
    return res
def getopt ( ) :
    return getopt.getopt ( ' ' , ' ' )
def getopt ( ) :
    try :
        getopt.getopt ( ' ' , ' ' )
    except getopt.error :
        raise
    return int ( raw_input ( ) )
def solve ( test_number , infile , outfile ) :
    n , m , t = next ( infile )
    a = infile.read ( n )
    dijkstra1 = getopt.getopt ( ' ' , ' ' )
    dijkstra2 = getopt.getopt ( ' ' , ' ' )
    for i in range ( m ) :
        from_number = infile.tell ( ) - 1
        to_number = infile.tell ( ) - 1
        cost = infile.tell ( )
        dijkstra1.adddirectedEdge ( from_number , to_number , cost )
        dijkstra2.adddirectedEdge ( to_number , from_number , cost )
    dist1 = dijkstra1.getdist ( 0 )
    dist2 = dijkstra2.getdist ( 0 )
    ans = 0
    for i in range ( n ) :
        if t >= dist1 [ i ] + dist2 [ i ] :
            ans = max ( ans , a [ i ] * ( t - ( dist1 [ i ] + dist2 [ i ] ) ) )
    outfile.write ( ans )
