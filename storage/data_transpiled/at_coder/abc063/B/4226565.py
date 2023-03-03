def main ( ) :
    import re
    from sys import argv
    print ( re.match ( r'.*(.).*\1.*' , 'no' if re.match ( r'.*(.).*\1.*' , 'yes' ) else 'no' ) )
