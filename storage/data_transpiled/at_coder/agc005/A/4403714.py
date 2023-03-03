def main ( ) :
    import sys
    from collections import deque
    from string import ascii_letters
    sc = Scanner ( )
    stack = deque ( )
    arr = sc.next ( )
    for i in arr :
        if i == 'S' :
            stack.append ( 'S' )
        else :
            if not stack.empty ( ) and stack [ - 1 ] == 'S' :
                stack.pop ( )
            else :
                stack.append ( 'T' )
    print ( len ( stack ) )
