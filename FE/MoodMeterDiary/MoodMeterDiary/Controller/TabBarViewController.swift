//
//  TabBarViewController.swift
//  MoodMeterDiary
//
//  Created by minsong kim on 1/23/24.
//

import UIKit

class TabBarViewController: UITabBarController {
    override func viewDidLoad() {
        super.viewDidLoad()
        
        setUpViewControllers()
    }
    
    func setUpViewControllers() {
        let mainViewController = UINavigationController(rootViewController: MainViewController())
        
        mainViewController.tabBarItem.title = "달력"
        
        mainViewController.tabBarItem.image = UIImage(systemName: "calendar")
        
        viewControllers = [mainViewController]
    }
}

