def import import sys , os , sys , time
from time import sleep
from time import sleep
from sys import stdout
import sys
import os
import sys
import sys
import time
try :
    f = open ( sys.argv [ 1 ] )
except :
    sys.stderr.write ( 'Please enter a file or directory: %s\n' % sys.argv [ 1 ] )
    return
N = int ( f.readline ( ) )
rainTimes = [ False ] * ( 24 * 12 + 1 )
for i in range ( N ) :
    rainTime = f.readline ( ).split ( '-' )
    rainFrom = int ( rainTime [ 0 ] )
    rainTo = int ( rainTime [ 1 ] )
    for j in range ( rainFrom / 100 * 12 + ( rainFrom % 100 ) / 5 , rainTo / 100 * 12 + ( rainTo % 100 + 4 ) / 5 ) :
        rainTimes [ j ] = True
for i in range ( 24 * 12 ) :
    if not rainTimes [ i ] :
        continue
    print ( '%02d%02d-' % ( i // 12 , i % 12 * 5 ) , end = ' ' )
    while i < 24 * 12 and rainTimes [ i ] and rainTimes [ i + 1 ] :
        i += 1
    i += 1
    print ( '%02d%02d' % ( i // 12 , i % 12 * 5 ) )
