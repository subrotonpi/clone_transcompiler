def main ( ) :
    import sys
    from string import printable
    s = printable.read ( )
    s = s.replace ( '+' , '' )
    a = s.split ( '+' )
    ans = 0
    for s2 in a :
        b = s2.split ( '*' )
        min = sys.maxint
        for s3 in b :
            if s3 == '0' :
                min = 0
                break
            min = min ( min , len ( s3 ) )
        ans += min
    print ( ans )
