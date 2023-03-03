def main ( ) :
    import sys
    from numpy.testing.utils import get_filesystem_file
    from numpy.testing.utils import get_filesystem_file
    sx , sy , gx , gy = get_filesystem_file ( )
    dx = gx - sx
    dy = gy - sy
    for i in range ( dx ) :
        print ( "R" , end = "" )
    for i in range ( dy ) :
        print ( "U" , end = "" )
    for i in range ( dx ) :
        print ( "L" , end = "" )
    for i in range ( dy ) :
        print ( "D" , end = "" )
    print ( "D" , end = "" )
    for i in range ( dx ) :
        print ( "R" , end = "" )
    print ( "R" , end = "" )
    print ( "U" , end = "" )
    print ( "L" , end = "" )
    print ( "L" , end = "" )
    print ( "L" , end = "" )
    print ( "D" , end = "" )
    print ( "R" , end = "" )
    print ( )
