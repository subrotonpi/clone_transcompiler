def main ( ) :
    import sys
    from collections import deque
    from string import printable
    with open ( sys.argv [ 1 ] , 'r' ) as sc :
        X = sc.read ( )
    stack = deque ( )
    for char in X :
        if char == 'S' :
            stack.append ( char )
        else :
            if len ( stack ) == 0 :
                stack.append ( char )
            elif stack [ - 1 ] == 'S' :
                stack.pop ( )
            elif stack [ - 1 ] == 'T' :
                stack.append ( char )
    print ( len ( stack ) )
