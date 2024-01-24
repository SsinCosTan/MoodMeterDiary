//
//  DiaryViewController.swift
//  MoodMeterDiary
//
//  Created by minsong kim on 1/23/24.
//

import UIKit

class DiaryViewController: UIViewController {
    let happyLabel: UILabel = {
        let label = UILabel()
        label.font = .preferredFont(forTextStyle: .title3)
        label.text = "HAPPINESS"
        
        return label
    }()
    
    let energyLabel: UILabel = {
        let label = UILabel()
        label.font = .preferredFont(forTextStyle: .title3)
        label.text = "ENERGY"
        
        return label
    }()
    
    let happySlider: UISlider = {
        let slider = UISlider()
        slider.minimumValue = 0
        slider.maximumValue = 10
        slider.maximumValueImage = UIImage(systemName: "hand.thumbsup.fill")
        slider.minimumValueImage = UIImage(systemName: "hand.thumbsdown.fill")
        slider.translatesAutoresizingMaskIntoConstraints = false
        
        return slider
    }()
    
    let energySlider: UISlider = {
        let slider = UISlider()
        slider.minimumValue = 0
        slider.maximumValue = 10
        slider.maximumValueImage = UIImage(systemName: "sun.max.fill")
        slider.minimumValueImage = UIImage(systemName: "cloud.drizzle.fill")
        slider.translatesAutoresizingMaskIntoConstraints = false
        
        return slider
    }()
    
    let happyStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.axis = .vertical
        stackView.alignment = .center
        
        return stackView
    }()
    
    let energyStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.axis = .vertical
        stackView.alignment = .center
        
        return stackView
    }()
    
    let stackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .vertical
        stackView.distribution = .equalSpacing
        
        return stackView
    }()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        view.backgroundColor = .cyan
        view.addSubview(stackView)
        
        configureStackView()
        configureSlider()
    }
    
    func configureStackView() {
        happyStackView.addArrangedSubview(happyLabel)
        happyStackView.addArrangedSubview(happySlider)
        energyStackView.addArrangedSubview(energyLabel)
        energyStackView.addArrangedSubview(energySlider)
        
        stackView.addArrangedSubview(happyStackView)
        stackView.addArrangedSubview(energyStackView)
        
        NSLayoutConstraint.activate([
            stackView.leadingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.leadingAnchor, constant: 32),
            stackView.trailingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.trailingAnchor, constant: -32),
            stackView.topAnchor.constraint(equalTo: view.safeAreaLayoutGuide.topAnchor, constant: 50),
            stackView.bottomAnchor.constraint(equalTo: view.safeAreaLayoutGuide.bottomAnchor, constant: -100)
        ])
    }
    
    func configureSlider() {
        NSLayoutConstraint.activate([
            happySlider.leadingAnchor.constraint(equalTo: stackView.leadingAnchor),
            happySlider.trailingAnchor.constraint(equalTo: stackView.trailingAnchor),
            energySlider.leadingAnchor.constraint(equalTo: stackView.leadingAnchor),
            energySlider.trailingAnchor.constraint(equalTo: stackView.trailingAnchor)
        ])
    }
}
