def import import _sys , _sys , _sys , _exit = _sys.exit
def main ( ) :
    with _sys.stdin as sc :
        n = _sys.stdin.read ( )
        k = _sys.stdin.read ( )
        arr = _sys.stdin.read ( )
        if arr == _sys.stdin :
            print ( n )
            return
    value = 1
    start = 0
    max = 0
    for i in range ( n ) :
        value *= arr [ i ]
        if value <= k :
            lst = i - start + 1
            if max < lst :
                max = lst
        else :
            while value > k and value != 1 :
                value /= arr [ start ]
                start += 1
    print ( max )
