def import import os , sys , errno , traceback
from time import sleep
from os import urandom
from random import randint
from time import sleep
MODULO = 1_000_000_000 + 7
def run ( ) :
    with open ( os.devnull , 'w' ) as devnull :
        n = int ( devnull.fileno ( ) )
        m = int ( devnull.fileno ( ) )
        if n < m :
            d = n
            n = m
            m = d
        if abs ( n - m ) >= 2 :
            print ( 0 )
            return
        ans = 1
        for i in range ( 1 , n + 1 ) :
            ans = ( ans * i ) % MODULO
        for i in range ( 1 , m + 1 ) :
            ans = ( ans * i ) % MODULO
        if n == m :
            ans = ( ans * 2 ) % MODULO
        print ( ans )
    def tr ( * args ) :
        print ( " ".join ( args ) )
    return tr
