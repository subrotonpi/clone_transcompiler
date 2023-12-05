def main ( ) :
    import sys
    from string import printable
    reader = open ( 'input.txt' , 'r' )
    N = reader.readline ( )
    num = 0
    for ch in N :
        num += ord ( ch )
    if int ( N ) % num == 0 :
        print ( 'Yes' )
    else :
        print ( 'No' )
    reader.close ( )
