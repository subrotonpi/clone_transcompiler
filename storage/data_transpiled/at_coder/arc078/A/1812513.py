def main ( ) :
    import sys
    stdscr = curses.initscr ( )
    c = stdscr.readline ( )
    vals = stdscr.readline ( )
    ls = [ ]
    ss = vals.split ( )
    total = 0
    sunu = [ ]
    for v in ss :
        ls.append ( v )
        total += v
        sunu.append ( total )
    min = 0
    for i in range ( len ( ls ) - 1 ) :
        arai = total - sunu [ i ]
        current = abs ( arai - sunu [ i ] )
        if i == 0 :
            min = current
        min = min ( min , current )
    print ( min )
