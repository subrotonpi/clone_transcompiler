def main ( ) :
    import sys
    from itertools import repeat
    reader = open ( sys.argv [ 1 ] )
    a = reader.read ( )
    b = reader.read ( )
    c = reader.read ( )
    result = repeat ( c * 10 + b + a , 10 )
    result.append ( a * 10 + b + c )
    result.append ( b * 10 + a + c )
    result.append ( c * 10 + a + b )
    result.append ( a * 10 + c + b )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + c + a )
    result.append ( a * 10 + b + c )
    result.append ( b * 10 + c + a )
    result.append ( a * 10 + b + c )
    result.append ( b * 10 + c + a )
    result.append ( a * 10 + b + c )
    result.append ( b * 10 + c + a )
    result.append ( a * 10 + b + c )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + c + b )
    result.append ( b * 10 + c + a )
    result.append ( a * 10 + b + c )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + c + b )
    result.append ( a * 10 + b + c )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + c + b )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + c + b )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + c + b )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + b + a )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + b + a )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + b + a )
    result.append ( b * 10 + c + a )
    result.append ( b * 10 + b )
