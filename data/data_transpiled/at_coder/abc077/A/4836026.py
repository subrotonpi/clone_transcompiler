def main ( ) :
    import sys
    import string
    import string
    import string
    import sys
    input = string.split ( sys.stdin.read ( ) )
    word1 = input.strip ( )
    word2 = input.strip ( )
    state = True
    for i , j in zip ( range ( 0 , len ( word2 ) - 1 , len ( word1 ) ) , word2 ) :
        if word1 [ i ] != word2 [ j ] :
            state = False
            break
    if state :
        print ( "YES" )
    else :
        print ( "NO" )
