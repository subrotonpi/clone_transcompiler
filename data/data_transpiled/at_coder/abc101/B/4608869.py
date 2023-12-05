def main ( args ) :
    import sys
    import string
    import string
    import string
    import sys
    input = open ( 'input' , 'r' )
    n = input.readline ( )
    num = int ( n )
    input.close ( )
    w = 0
    for c in n :
        w += string.atoi ( c )
    print ( 'Yes' if num % w == 0 else 'No' )
