def main ( ) :
    import sys
    import string
    import string
    import string
    import sys
    input = string.input
    word = input.split ( )
    start , end = - 1 , - 1
    for i in range ( len ( word ) ) :
        if word [ i ] == 'A' :
            start = i
            break
    for i in range ( len ( word ) - 1 , 0 , - 1 ) :
        if word [ i ] == 'Z' :
            end = i
            break
    print ( end - start + 1 )
