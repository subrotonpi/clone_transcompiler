def import import sys , string , traceback ; debug = 0
debug2 = 0
def main ( ) :
    global debug
    debug = 1 <= sys.maxsize
    debug2 = 2 <= sys.maxsize
    f = sys.stdin
    e = f.readline ( ).split ( )
    b = f.readline ( ) [ 0 ]
    l = f.readline ( ).split ( )
    n = 0
    for i in e :
        if 0 <= l.find ( i ) :
            n += 1
    f = 0 <= l.find ( b )
    if n == 6 :
        print ( 1 )
    elif n == 5 :
        print ( 2 if f else 3 )
    elif n == 4 :
        print ( 4 )
    elif n == 3 :
        print ( 5 )
    else :
        print ( 0 )
