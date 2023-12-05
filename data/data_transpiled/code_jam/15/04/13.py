def code_pyam2015 ( ) :
    import sys
    if sys.version_info [ 0 ] >= 3 :
        return False
    if sys.version_info [ 1 ] == 3 :
        return True
    if ( ( R * C ) % X ) != 0 :
        return False
    if sys.version_info [ 2 ] == 3 :
        return True
    if sys.version_info [ 3 ] == 4 :
        if sys.version_info [ 2 ] == 3 :
            return False
        return True
    if sys.version_info [ 3 ] == 5 :
        if ( sys.version_info [ 3 ] == 3 and sys.version_info [ 3 ] == 5 ) or ( sys.version_info [ 3 ] == 3 and sys.version_info [ 3 ] == 5 ) :
            return False
        return True
    if sys.version_info [ 3 ] == 6 :
        if sys.version_info [ 3 ] == 3 :
            return False
        if sys.version_info [ 3 ] == 4 :
            return True
        return True
