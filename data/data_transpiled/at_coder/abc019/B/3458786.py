def main ( ) :
    import sys
    from string import printable
    sc = open ( 'input.txt' , 'r' )
    data = sc.read ( )
    sc.close ( )
    ans = [ ]
    char = data [ 0 ]
    num = 1
    for char in data [ 1 : ] :
        if char != char :
            ans.append ( char )
            ans.append ( num )
            num = 1
            char = char
        else :
            num += 1
    ans.append ( char )
    ans.append ( num )
    print ( ''.join ( ans ) )
