def main ( ) :
    import sys
    import os
    import string
    import string
    import sys
    input = string.split ( sys.stdin.read ( ) )
    word = input.strip ( )
    largest = 0
    for i in range ( len ( word ) - 1 , 1 , - 1 ) :
        if i % 2 == 0 :
            midle = i / 2
            state = True
            for j , midle in enumerate ( word [ i / 2 : ] ) :
                if word [ j ] != word [ midle ] :
                    state = False
                    break
            if state :
                largest = max ( largest , i )
    print ( largest )
