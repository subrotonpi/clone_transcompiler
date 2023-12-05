def import import os , sys , time
from os import urandom
from time import time
import sys
import os
import sys
import os
import time
import random
import sys
MODULE = 100003
MAX = 500
def do_main ( ) :
    with open ( 'input.txt' , 'r' ) as sc :
        with open ( 'output.txt' , 'w' ) as pw :
            casecnt = sc.randint ( 1 , MAX + 1 )
            time = time ( )
            for i in range ( 0 , MAX + 1 ) :
                C [ i , 0 ] = C [ i , i ] = 1
                for j in range ( 1 , i ) :
                    C [ i , j ] = ( C [ i - 1 , j ] + C [ i - 1 , j - 1 ] ) % MODULE
    memo = [ [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 1 ] * MAX + [ 0 ] * MAX + [ 1 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX + [ 0 ] * MAX