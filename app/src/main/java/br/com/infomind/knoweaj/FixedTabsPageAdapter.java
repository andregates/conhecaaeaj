package br.com.infomind.knoweaj;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**

 */
public class FixedTabsPageAdapter extends FragmentPagerAdapter {

    public FixedTabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PontosInteresseF1();
            case 1:
                return new DetalhesPontoF2();
            case 2:
                return new Map();//return new Map();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Interesses";
            case 1:
                return "Detalhes";
            case 2:
                return "Mapa";
            default:
                return null;
        }
    }


}
