def main ( args ) :
    import sys
    from os.path import join
    from os import sep
    with open ( join ( args [ 1 : ] , '..' ) ) as sc :
        N = sc.read ( )
    for i in N :
        if i == '9' :
            print ( 'Yes' )
            return
    print ( 'No' )
